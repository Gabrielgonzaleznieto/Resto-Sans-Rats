-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-10-2018 a las 18:26:22
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id_empleado` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` int(40) NOT NULL,
  `edad` int(11) NOT NULL,
  `referencias` varchar(300) NOT NULL,
  `sueldo` double NOT NULL,
  `contraseña` varchar(20) NOT NULL,
  `mesas` varchar(15) NOT NULL,
  `rango` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `e_mail` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id_empleado`, `nombre`, `dni`, `edad`, `referencias`, `sueldo`, `contraseña`, `mesas`, `rango`, `telefono`, `e_mail`) VALUES
(24, 'Andrea Sanabria', 22342334, 38, 'Vive en la Ciudad de la Punta.', 15000, '12345', '1,2,3,4,5', 'EMPLEADO', '2664000000', 'gabisago@gmail.com'),
(25, 'Nabila Guevara', 33464446, 30, 'Vive en San Luis Capital.', 15000, '12345', '6,7,8,9,10', 'EMPLEADO', '2664111111', 'Nabiyd@gmail.com'),
(26, 'Hector Gutierrez', 38439011, 30, 'Vive en San Luis Capital.', 15000, '12345', '11,12,13,14,15', 'EMPLEADO', '2664222222', 'Hectoguti071@gmail.com'),
(27, 'Gabriel Gonzalez', 30896792, 34, 'Administrativo General.', 22000, '12345', '-', 'ADMINISTRADOR', '2664555888', 'Gagonzalez00@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `id_pedido` int(100) NOT NULL,
  `Producto` varchar(50) NOT NULL,
  `Codigo` varchar(200) NOT NULL,
  `Cantidad` int(50) NOT NULL,
  `Precio` double NOT NULL,
  `Total` double NOT NULL,
  `Nombre_Mesero` varchar(50) NOT NULL,
  `DNI_Mesero` int(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id_pedido`, `Producto`, `Codigo`, `Cantidad`, `Precio`, `Total`, `Nombre_Mesero`, `DNI_Mesero`) VALUES
(9, 'coca cola litro', '12111', 1, 145, 145, 'Andrea Sanabria', 22342334),
(10, 'Milanesa Napolitana', '11211', 1, 220, 220, 'Andrea Sanabria', 22342334),
(11, 'Lomito Completo', '33344', 2, 270, 540, 'Hector Gutierrez', 38439011),
(12, 'Empanadas ', '1213323', 12, 25, 300, 'Hector Gutierrez', 38439011),
(13, 'Pizza Especial', '565656', 1, 290, 290, 'Nabila Guevara', 33464446),
(14, 'Lomo Completo', '14156', 1, 256, 256, 'Nabila Guevara', 33464446);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservaciones`
--

CREATE TABLE `reservaciones` (
  `id_res` int(11) NOT NULL,
  `nombres` varchar(40) NOT NULL,
  `numpersonas` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `mesas` varchar(15) NOT NULL,
  `costo` double NOT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `mail` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reservaciones`
--

INSERT INTO `reservaciones` (`id_res`, `nombres`, `numpersonas`, `fecha`, `mesas`, `costo`, `tel`, `mail`) VALUES
(21, 'Matias Sanchez', 4, '2018-10-23', '2', 60, '2664333333', 'matosanchez@hotmail.com'),
(22, 'Lucia Fernanda Perez', 2, '2018-10-23', '1', 60, '266453546', 'luciafer12@gmail.com'),
(23, 'Luciano Pereyra', 4, '2018-10-23', '3', 60, '0112345566', 'lucianopereyra@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id_empleado`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id_pedido`);

--
-- Indices de la tabla `reservaciones`
--
ALTER TABLE `reservaciones`
  ADD PRIMARY KEY (`id_res`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id_pedido` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `reservaciones`
--
ALTER TABLE `reservaciones`
  MODIFY `id_res` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
