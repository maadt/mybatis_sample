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

import com.example.entity.Course;

@Mapper
public interface CourseMapper {
    public List<Course> findAll();
}