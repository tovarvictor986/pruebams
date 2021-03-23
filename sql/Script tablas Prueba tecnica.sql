CREATE TABLE pruebams.TEST_CLIENTE(
IdCliente int AUTO_INCREMENT,
Identifiacion numeric(18,0) not null,
Nombres varchar(100) not null,
Apellidos varchar(100) not null,
Direccion varchar(300) not null,
Telefono varchar(50),
Email varchar(100), primary key(IdCliente)
)

;

CREATE TABLE pruebams.TEST_PRODUCTO(
IdProducto int AUTO_INCREMENT,
Codigo varchar(30) not null,
Nombre varchar(100) not null,
ValorUnidad numeric(18,3) not null,
Stock int not null, primary key(IdProducto)
)

;

CREATE TABLE pruebams.TEST_FACTURA(
IdFactura int AUTO_INCREMENT,
IdCliente int not null,
FechaVenta datetime not null,
ValorTotal int not null, primary key(IdFactura),
foreign key(IdCliente) references TEST_CLIENTE(IdCliente)
)

;

CREATE TABLE pruebams.TEST_FACTURA_DETALLE(
IdFacturaDetalle int AUTO_INCREMENT,
IdFactura int not null,
IdProducto int not null,
Cantidad int not null,
ValorUnidad int not null,
ValorTotal int not null, primary key(IdFacturaDetalle),
foreign key(IdFactura) references TEST_FACTURA(IdFactura),
foreign key(IdProducto) references TEST_PRODUCTO(IdProducto)
)

;

INSERT INTO pruebams.TEST_CLIENTE(Identifiacion, Nombres, Apellidos, Direccion, Telefono, Email) VALUES('11223344','CLIENTE','BAJO','CALLE 1 # 2-1','3210099','CL01@YAHOO.ES');
INSERT INTO pruebams.TEST_CLIENTE(Identifiacion, Nombres, Apellidos, Direccion, Telefono, Email) VALUES('789456','PETER','ROJO','CALLE 11 # 21-11',NULL,NULL);
INSERT INTO pruebams.TEST_CLIENTE(Identifiacion, Nombres, Apellidos, Direccion, Telefono, Email) VALUES('66995522','JAIR','RUIZ','CALLE 63 # 55-1','3669955','JAIR@YAHOO.ES');
INSERT INTO pruebams.TEST_CLIENTE(Identifiacion, Nombres, Apellidos, Direccion, Telefono, Email) VALUES('2255448','VICTOR','BARCO','CALLE 19 # 21','7410022','VICTOR@YAHOO.ES');
INSERT INTO pruebams.TEST_CLIENTE(Identifiacion, Nombres, Apellidos, Direccion, Telefono, Email) VALUES('123456789','MARIA','CALLE','CALLE 61 # 77D-96','6660005','CALLE@YAHOO.ES');
INSERT INTO pruebams.TEST_CLIENTE(Identifiacion, Nombres, Apellidos, Direccion, Telefono, Email) VALUES('41000333','LUIS','CORREO','CALLE 45 # 32-11','4444444','LCORREO@YAHOO.ES');

INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0001','TOSTACOS',950,15);
INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0002','LECHE',2350,40);
INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0003','PLATANO',1500,20);
INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0004','PAÑALES',36500,4);
INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0005','BULTO DE MANDARINAS',156800,9);
INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0006','ARROZ',6450,60);
INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0007','PESCADO',99000,45);
INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0008','HUEVOS',11500,20);
INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0009','PAPAS JAJAJAJA',6600,1);
INSERT INTO pruebams.TEST_PRODUCTO(Codigo, Nombre, ValorUnidad, Stock) VALUES('0010','DETERGENTE',5001000,3);
