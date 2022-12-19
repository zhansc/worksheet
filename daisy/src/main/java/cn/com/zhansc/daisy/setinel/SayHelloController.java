package cn.com.zhansc.daisy.setinel;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author zhanss
 * @since 2022-12-14
 */
@RestController
public class SayHelloController {

    private static final String SAY_HELLO_RESOURCE = "sayHello";

    @SentinelResource(value = SAY_HELLO_RESOURCE, fallback = "fallback")
    @GetMapping("/sayHello")
    public String sayHello() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }

    public String fallback() {
        return "say hellllllll...";
    }

    public static void main(String[] args) {
//        initFlowRules();
        int i = 100;
        while (i != 0) {
            Entry entry = null;
            i --;
            try {
                entry = SphU.entry(SAY_HELLO_RESOURCE);
                System.out.println("say hello");
            } catch (BlockException e) {
                System.out.println("block");
            } finally {
                if (entry != null) {
                    entry.exit();
                }
            }
        }
    }

}
