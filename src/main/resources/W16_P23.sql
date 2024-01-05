CREATE TABLE owner
(
    owner_id    SERIAL      NOT NULL,
    name        VARCHAR(32) NOT NULL,
    surname     VARCHAR(32) NOT NULL,
    phone       VARCHAR(32) NOT NULL,
    email       VARCHAR(32) NOT NULL,
    PRIMARY KEY (owner_id)
);

CREATE TABLE pet
(
    pet_id      SERIAL      NOT NULL,
    name        VARCHAR(32) NOT NULL,
    breed       VARCHAR(32) NOT NULL,
    owner_id    INT,
    PRIMARY KEY (pet_id),
    CONSTRAINT fk_pet_owner
        FOREIGN KEY (owner_id)
            REFERENCES owner (owner_id)
);

