package cn.com.zhansc.daisy;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DaisyApplication {

    private static final String SAY_HELLO_RESOURCE = "sayHello";

    public static void main(String[] args) {
        initFlowRules();
        SpringApplication.run(DaisyApplication.class, args);
    }

    private static void initFlowRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule flowRule = new FlowRule();
        flowRule.setRefResource(SAY_HELLO_RESOURCE);
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rules.add(flowRule);
        FlowRuleManager.loadRules(rules);
    }
}
