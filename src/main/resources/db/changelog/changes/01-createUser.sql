-- liquibase formatted sql

-- changeset abdo:create-users-table
CREATE TABLE IF NOT EXISTS users (
     id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
     password VARCHAR(255) NOT NULL,
     email VARCHAR(100) NOT NULL UNIQUE,
     first_name VARCHAR(50) NOT NULL,
     last_name VARCHAR(50) NOT NULL,
     isActive BOOLEAN NOT NULL DEFAULT TRUE,
     created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);