CREATE TABLE category (
                          id SERIAL PRIMARY KEY,
                          description VARCHAR(255)
);

CREATE TABLE unit_of_measure (
                                 id SERIAL PRIMARY KEY,
                                 description VARCHAR(255)
);

-- Insert data into category table
INSERT INTO category (description) VALUES ('American');
INSERT INTO category (description) VALUES ('Italian');
INSERT INTO category (description) VALUES ('Mexican');
INSERT INTO category (description) VALUES ('Fast Food');

-- Insert data into unit_of_measure table
INSERT INTO unit_of_measure (description) VALUES ('Teaspoon');
INSERT INTO unit_of_measure (description) VALUES ('Tablespoon');
INSERT INTO unit_of_measure (description) VALUES ('Cup');
INSERT INTO unit_of_measure (description) VALUES ('Pinch');
INSERT INTO unit_of_measure (description) VALUES ('Ounce');
INSERT INTO unit_of_measure (description) VALUES ('Each');
INSERT INTO unit_of_measure (description) VALUES ('Dash');
INSERT INTO unit_of_measure (description) VALUES ('Pint');

-- Create recipe table
CREATE TABLE IF NOT EXISTS recipe (
                                      id SERIAL PRIMARY KEY,
                                      cook_time VARCHAR(255),
                                      description VARCHAR(500),
                                      difficulty VARCHAR(255),
                                      directions VARCHAR(255),
                                      image VARCHAR(255),
                                      notes_id BIGINT,
                                      prep_time VARCHAR(255),
                                      servings VARCHAR(255),
                                      source VARCHAR(255),
                                      url VARCHAR(255)
);

-- Alter table to modify column type
ALTER TABLE recipe
    ALTER COLUMN directions TYPE VARCHAR(1000);