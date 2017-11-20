package com.venkat.springbatch;

import org.springframework.batch.item.ItemProcessor;

import com.venkat.springbatch.model.Score;

public class ExamResultItemProcessor implements ItemProcessor<Score, Score>{

	@Override
	public Score process(Score result) throws Exception {
		System.out.println("Processing result:"+result);
		
		if(result.getPercentage() < 60)
		{
			return null;
		}
		return result;
	}

}
