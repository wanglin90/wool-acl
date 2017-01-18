package com.wool.acl.dao.mapper;

import com.wool.acl.model.database.RoleResourceRelation;
import com.wool.acl.model.database.RoleResourceRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleResourceRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    int countByExample(RoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    int deleteByExample(RoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    int insert(RoleResourceRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    int insertSelective(RoleResourceRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    List<RoleResourceRelation> selectByExample(RoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    RoleResourceRelation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RoleResourceRelation record, @Param("example") RoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RoleResourceRelation record, @Param("example") RoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RoleResourceRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wool_acl_role_resource_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RoleResourceRelation record);
}