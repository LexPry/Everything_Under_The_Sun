CREATE TABLE orders
(
    id           BIGINT AUTO_INCREMENT NOT NULL,
    date_created date                  NULL,
    status       VARCHAR(255)          NULL,
    CONSTRAINT pk_orders PRIMARY KEY (id)
);
CREATE TABLE product
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255)          NOT NULL,
    price         DOUBLE                NOT NULL,
    `description` VARCHAR(255)          NULL,
    image_url     VARCHAR(255)          NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);
CREATE TABLE user
(
    user_id    BIGINT       NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name  VARCHAR(255) NOT NULL,
    email      VARCHAR(255) NULL,
    age        INT          NULL,
    password   VARCHAR(255) NULL,
    CONSTRAINT pk_user PRIMARY KEY (user_id)
);
CREATE TABLE order_product
(
    quantity   INT    NOT NULL,
    order_id   BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    CONSTRAINT pk_orderproduct PRIMARY KEY (order_id, product_id)
);

ALTER TABLE order_product
    ADD CONSTRAINT FK_ORDERPRODUCT_ON_ORDER FOREIGN KEY (order_id) REFERENCES orders (id);

ALTER TABLE order_product
    ADD CONSTRAINT FK_ORDERPRODUCT_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);