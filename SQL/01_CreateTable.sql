\c tsukasavlogmap

CREATE TABLE travel_source (
    source_id CHAR(26) NOT NULL,
    type VARCHAR(10) NOT NULL,
    title VARCHAR(256) NOT NULL,
    url VARCHAR(256) NOT NULL,
    CONSTRAINT pk_travel_source PRIMARY KEY (source_id)
);

CREATE TABLE visited_location (
    location_id CHAR(26) NOT NULL,
    name VARCHAR(256) NOT NULL,
    address VARCHAR(512) NOT NULL,
    type VARCHAR(10) NOT NULL,
    place_lat NUMERIC NOT NULL,
    place_lng NUMERIC NOT NULL,
    place_id VARCHAR(256),
    source_id CHAR(26) NOT NULL,
    FOREIGN KEY (source_id) REFERENCES travel_source (source_id),
    CONSTRAINT pk_visited_location PRIMARY KEY (location_id)
);

CREATE TABLE visited_route (
    location_id CHAR(26) NOT NULL,
    polyline VARCHAR(1024) NOT NULL,
    FOREIGN KEY (location_id) REFERENCES visited_location (location_id),
    CONSTRAINT pk_visited_route PRIMARY KEY (location_id)
);