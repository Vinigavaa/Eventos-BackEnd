CREATE EXTENTION IF NOT EXISTS 'pg-crypto';

CREATE TABLE event(
    id UUID get_random_uuid() PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL,
    img_url VARCHAR(250) NOT NULL,
    event_url VARCHAR(250) NOT NULL,
    date TIMESTAMP NOT NULL,
    remote BOOLEAN NOT NULL
);