package com.werewolf.core.entity;

public class role {
    //角色名
    private String name;
    //角色Id
    private String id;
    //角色技能Id
    private String SkillId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkillId() {
        return SkillId;
    }

    public void setSkillId(String skillId) {
        SkillId = skillId;
    }
}
