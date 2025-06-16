CREATE EXTENTION IF NOT EXISTS 'pg-crypto';

CREATE TABLE endereco(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    cidade VARCHAR(250) NOT NULL,
    uf VARCHAR(100) NOT NULL,
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);