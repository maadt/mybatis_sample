package com.example.mapper;

//Spring Data JPAの時に作成したRepositoryのような役割
/*
 Spring Data JPAとの違い
 ・アノテーションは@Mapperを使用する
 　このアノテーションを使用することで、MyBatisの機能が使えるようになる他、
 　ControllerやServiceクラスでコンストラクタインジェクションができるようになります。
 ・メソッド名を自由に定義できる
 　Spring Data JPAでは、実行したいSQLによってメソッド名にはfindByカラム名などの命名規則がありました。
 　一方、MyBatisではそういったルールがないため、任意のメソッド名で定義できます。
 　findAllやselectAllのようにデータを全件取得していることがわかりやすい名前を付けるようにしましょう。
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.Course;

@Mapper
public interface CourseMapper {
    public List<Course> findAll(@Param("courseId") Integer courseId
    		                    , @Param("courseName") String courseName);//条件検索処理
    //@Param：メソッドが受け取るパラメータを指定する
    public void insert(Course course); //新規登録処理   
    public Course findById(Integer id);//一件取得処理
    public void update(Course course);//更新処理
    public void deleteById(Integer id);//削除処理
}