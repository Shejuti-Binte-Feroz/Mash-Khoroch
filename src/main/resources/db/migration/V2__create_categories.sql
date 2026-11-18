CREATE TABLE categories (
    id      BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id BIGINT       NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    name    VARCHAR(100) NOT NULL,
    CONSTRAINT uq_categories_user_name UNIQUE (user_id, name)
);
