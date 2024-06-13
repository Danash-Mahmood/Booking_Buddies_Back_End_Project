package com.backend_project.backend_hobby_project.models;

import java.util.List;

public class PrivateUserDTO {


        private String name;
        private int age;
        private String location;
        private String biography;
        private boolean isPrivate;
        private List<Long> hobbyIds;

        public PrivateUserDTO(String name, int age, String location, String biography, List<Long> hobbyIds, boolean isPrivate) {
            this.name = name;
            this.age = age;
            this.location = location;
            this.biography = biography;
            this.isPrivate = isPrivate;
            this.hobbyIds = hobbyIds;
        }

        public PrivateUserDTO() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getBiography() {
            return biography;
        }

        public void setBiography(String biography) {
            this.biography = biography;
        }

        public List<Long> getHobbyIds() {
            return hobbyIds;
        }

        public void setHobbyIds(List<Long> hobbyIds) {
            this.hobbyIds = hobbyIds;
        }

        public boolean getIsPrivate() {
            return isPrivate;
        }

        public void setIsPrivate(boolean isPrivate) {
            this.isPrivate = isPrivate;
        }
    }