package com.wool.acl.dao.mapper;

import com.wool.acl.model.database.UserAppRelation;
import com.wool.acl.model.database.UserAppRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAppRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    int countByExample(UserAppRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    int deleteByExample(UserAppRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    int insert(UserAppRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    int insertSelective(UserAppRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    List<UserAppRelation> selectByExample(UserAppRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    UserAppRelation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserAppRelation record, @Param("example") UserAppRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserAppRelation record, @Param("example") UserAppRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserAppRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_user_app_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserAppRelation record);
}