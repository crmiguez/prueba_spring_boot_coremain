DROP TABLE IF EXISTS Prices;
CREATE TABLE IF NOT EXISTS Prices(
    BrandId      INTEGER  NOT NULL,
    StartDate    VARCHAR(25) NOT NULL,
    EndDate      VARCHAR(25) NOT NULL,
    PriceList    INTEGER NOT NULL,
    ProductId    INTEGER NOT NULL,
    Priority     BIT NOT NULL,
    Price        NUMERIC(5,2) NOT NULL,
    Currency     VARCHAR(3) NOT NULL,
    LastUpdate   VARCHAR(25) NOT NULL,
    LastUpdateBy VARCHAR(5) NOT NULL
);