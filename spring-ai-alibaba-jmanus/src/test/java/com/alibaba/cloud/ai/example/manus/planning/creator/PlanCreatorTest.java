package com.alibaba.cloud.ai.example.manus.planning.creator;

import com.alibaba.cloud.ai.example.manus.planning.model.vo.ExecutionContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * PlanCreator 的测试类
 */
@SpringBootTest
@ActiveProfiles("test")
public class PlanCreatorTest {

    @Autowired
    private PlanCreator planCreator;

    @Test
    public void testFluxOutput() {
        // 创建测试上下文
        ExecutionContext context = new ExecutionContext();
        context.setPlanId("test-plan-001");
        context.setUserRequest("测试请求");

        // 执行测试方法
        System.out.println("test_start-------------------------------------");
        planCreator.testFluxOutput(context);

        // 等待一段时间以确保 Flux 完成
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
} 