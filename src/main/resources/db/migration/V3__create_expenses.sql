CREATE TABLE expenses (
    id           BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id      BIGINT      NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    category_id  BIGINT      NOT NULL REFERENCES categories (id),
    amount BIGINT      NOT NULL CHECK (amount > 0),
    expense_date DATE        NOT NULL,
    note         VARCHAR(500),
    created_at   TIMESTAMPTZ NOT NULL DEFAULT now()
);

CREATE INDEX idx_expenses_user_date ON expenses (user_id, expense_date);
