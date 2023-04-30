package com.puzzle.address.controller.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class AddressGroupDto {
    public static class GetAllGroups {
        @AllArgsConstructor
        @Getter
        public static class Response {
            private List<Group> group;
        }
    }

    public static class CreateParentGroup{
        @Getter
        public static class Request{
            @NotEmpty
            @Max(20)
            private String name;
        }

        @AllArgsConstructor
        @Getter
        public static class Response{
            private String uuid;
        }
    }

    public static class UpdateGroup {
        @Getter
        public static class Request {
            @NotEmpty
            @Max(20)
            private String name;
        }
    }

    @AllArgsConstructor
    @Setter
    @Getter
    public static class Group{
        private String name;
        private String uuid;
        private List<String> innerGroupNames;
        private List<Address> address;
    }

    @AllArgsConstructor
    @Getter
    public static class Address{
        private String name;
        private String uuid;
    }
}
