CREATE EXTENTION IF NOT EXISTS 'pg-crypto';

CREATE TABLE cupom(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    code VARCHAR(250) NOT NULL,
    discount INTEGER NOT NULL,
    valid TIMESTAMP NOT NULL,
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);