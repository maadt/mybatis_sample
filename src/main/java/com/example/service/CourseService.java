package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Course;
import com.example.mapper.CourseMapper;

@Service
public class CourseService {
	private final CourseMapper courseMapper;

	@Autowired
	public CourseService(CourseMapper courseMapper) {
		this.courseMapper = courseMapper;
	}

	public List<Course> findAll() {
		return this.courseMapper.findAll();
	}

	public void insert(String name) {
		Course course = new Course();
		course.setName(name);
		this.courseMapper.insert(course);
	}

	public Course findById(Integer id) {
		return this.courseMapper.findById(id);
	}

	public void update(Integer id, String name) {
		Course course = new Course();
		course.setId(id);
		course.setName(name);
		this.courseMapper.update(course);
	}
}

/* 登録時のデータを利用する場合
@Service
public class SampleService {
    public Sample sampleInsert(String name) {
        Sample sample = new Sample();
        sample.setName(name);
        // 登録前はIDは「0」（初期値）
        System.out.println(sample.getId());
        // 登録処理 自動採番されたIDをEntityに設定
        this.courseMapper.insert(sample);
        // IDに自動採番された値を取得できる
        System.out.println(sample.getId());
        // 登録完了時の状態を呼び出し元に返す
        return sample;
    }
*/
