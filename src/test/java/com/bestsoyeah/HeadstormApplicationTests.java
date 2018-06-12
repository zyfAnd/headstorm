package com.bestsoyeah;

import com.bestsoyeah.model.QuestionsRes;
import com.bestsoyeah.service.QuestionsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeadstormApplicationTests {

//	SELECT * FROM headstorm.t_question;
//	INSERT INTO `headstorm`.`t_question` (`id`, `subject`, `grade`, `lv`, `title`, `answer`, `level`, `A`, `B`, `C`, `D`)
// VALUES ('7', '世界杯', '7', 'LV1', '上一次中国参加世界杯是在哪一届', 'B', '0', '巴西世界杯', '2002年日韩世界杯', '意大利世界杯', '德国世界杯');
//	INSERT INTO `headstorm`.`t_question` (`id`, `subject`, `grade`, `lv`, `title`, `answer`, `level`, `A`, `B`, `C`, `D`) VALUES ('8', '世界杯', '7', 'LV1', '每一队在场比赛的运动员有几名', 'C', '0', '10', '13', '11', '9');

	@Autowired
	QuestionsService questionsService;
	@Test
	public void contextLoads() {
		for (int i=0;i<100;i++){
			QuestionsRes questionsRes = new QuestionsRes("世界杯","7","LV1","上一次中国参加世界杯是在哪一届",
					"B","0","巴西世界杯","2002年日韩世界杯","意大利世界杯","德国世界杯");
			questionsService.save(questionsRes);
		}
	}
	@Test
	public void readQuestion() throws IOException {
		FileReader fileReader = new FileReader("/Users/yanfu/IdeaProjects/headstorm/question.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		String line = "";
		String[] arr = null;
		while((line=reader.readLine())!=null){
			if(line.length()>0) {
				arr = line.split("\\?");
				System.out.println(arr[1]);
			}
//
//			System.out.println(line.substring(2,line.length()));
		}

	}

}
