package com.example.demo.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncConfiguration {
	
	@Bean("doSomethingExecutor")
	public Executor doSomethingExecutor() {

		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		// 核心線程數：線程池創建時候初始化的線程數
		executor.setCorePoolSize(5);
		// 最大線程數：線程池最大的線程數，只有在緩衝隊列滿了之後才會申請超過核心線程數的線程
		executor.setMaxPoolSize(20);
		// 緩衝隊列：用來緩衝執行任務的隊列
		executor.setQueueCapacity(500);
		// 允許線程的空閒時間60秒：當超過了核心線程之外的線程在空閒時間到達之後會被銷毀
		executor.setKeepAliveSeconds(60);
		// 線程池名的前綴：設置好了之後可以方便我們定位處理任務所在的線程池
		executor.setThreadNamePrefix("do-something-");
		// 緩衝隊列滿了之後的拒絕策略：由調用線程處理（一般是主線程）
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());

		executor.initialize();

		return executor;

	}

}
