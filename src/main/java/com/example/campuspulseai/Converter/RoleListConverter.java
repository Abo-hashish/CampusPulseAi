package com.example.campuspulseai.Converter;

import com.example.campuspulseai.Enum.Role;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Converter
public class RoleListConverter implements AttributeConverter<Set<Role>, String[]> {

    @Override
    public String[] convertToDatabaseColumn(Set<Role> roles) {
        return roles.stream()
                .map(Enum::name)
                .toArray(String[]::new);
    }

    @Override
    public Set<Role> convertToEntityAttribute(String[] dbData) {
        if (dbData == null) return Set.of();
        return Arrays.stream(dbData)
                .map(Role::valueOf)
                .collect(Collectors.toSet());
    }
}