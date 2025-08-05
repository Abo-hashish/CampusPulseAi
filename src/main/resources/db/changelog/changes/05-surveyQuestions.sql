-- liquibase formatted sql

-- changeset abdelrahman:create-survay_Questions-table
CREATE TABLE IF NOT EXISTS survay_questions (
    id BIGSERIAL PRIMARY KEY,
    question TEXT NOT NULL,
    allow_Mulltiple_Answers BOOLEAN DEFAULT FALSE,
    isActive BOOLEAN DEFAULT TRUE,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
