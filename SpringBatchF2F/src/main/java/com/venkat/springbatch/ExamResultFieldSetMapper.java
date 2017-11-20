package com.venkat.springbatch;

import org.joda.time.LocalDate;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.venkat.springbatch.model.Score;

public class ExamResultFieldSetMapper implements FieldSetMapper<Score>{

	@Override
	public Score mapFieldSet(FieldSet fieldSet) throws BindException {
		
		Score score = new Score();
		score.setStudentName(fieldSet.readString(0));
		score.setDob(new LocalDate(fieldSet.readDate(1,"dd/MM/yyyy")));
	    score.setPercentage(fieldSet.readDouble(2));
		
		return score;
	}

}
