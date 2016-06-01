-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 01-06-2016 a las 20:28:35
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 7.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ett`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comunidad`
--

CREATE TABLE `comunidad` (
  `id` bigint(20) NOT NULL,
  `version` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `demandante`
--

CREATE TABLE `demandante` (
  `id` bigint(20) NOT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `curriculum` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` datetime DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `resumen` varchar(255) DEFAULT NULL,
  `sexo` int(11) DEFAULT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `demandante`
--

INSERT INTO `demandante` (`id`, `apellidos`, `curriculum`, `fecha_nacimiento`, `foto`, `nombre`, `resumen`, `sexo`, `telefono`, `direccion`, `email`, `version`) VALUES
(1, 'fran', 'este es', '2016-05-26 00:00:00', 'no tengo', 'fran', 'soy yo', 0, 666666666, 'mi casa', 'a@gmail.com', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `id` bigint(20) NOT NULL,
  `cif` varchar(255) DEFAULT NULL,
  `actividad` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `n_empleados` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia_laboral`
--

CREATE TABLE `experiencia_laboral` (
  `id` bigint(20) NOT NULL,
  `empresa` varchar(255) DEFAULT NULL,
  `fecha_fin` datetime DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `demandante` bigint(20) DEFAULT NULL,
  `puestotrabajo` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `formacion`
--

CREATE TABLE `formacion` (
  `id` bigint(20) NOT NULL,
  `fecha_fin` datetime DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `observaciones` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `tipo_formacion` int(11) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `demandante` bigint(20) DEFAULT NULL,
  `titulacion` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `id` bigint(20) NOT NULL,
  `estado` int(11) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `demandante` bigint(20) DEFAULT NULL,
  `oferta` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localizacion`
--

CREATE TABLE `localizacion` (
  `id` bigint(20) NOT NULL,
  `localidad` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `provincia` varchar(255) DEFAULT NULL,
  `comunidad` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `empresa` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oferta`
--

CREATE TABLE `oferta` (
  `id` bigint(20) NOT NULL,
  `contrato` int(11) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `fecha_fin` datetime DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `numero_vacantes` int(11) NOT NULL,
  `perfil` int(11) DEFAULT NULL,
  `sueldo` float NOT NULL,
  `tipo_contrato` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `localizacion` bigint(20) DEFAULT NULL,
  `puestotrabajo` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puesto_trabajo`
--

CREATE TABLE `puesto_trabajo` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `demandante` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `titulaciones`
--

CREATE TABLE `titulaciones` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `oferta` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `dtype` varchar(31) NOT NULL,
  `id` bigint(20) NOT NULL,
  `enable` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `rol` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `version` int(11) DEFAULT NULL,
  `cif` varchar(255) DEFAULT NULL,
  `actividad` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `n_empleados` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `curriculum` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` datetime DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `resumen` varchar(255) DEFAULT NULL,
  `sexo` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`dtype`, `id`, `enable`, `password`, `rol`, `username`, `version`, `cif`, `actividad`, `email`, `n_empleados`, `nombre`, `apellidos`, `curriculum`, `fecha_nacimiento`, `foto`, `resumen`, `sexo`, `telefono`, `direccion`) VALUES
('admin', 1, 1, 'admin', 'ROLE_ADMIN', 'admin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('', 2, 1, 'empresa', 'ROLE_EMPRESA', 'empresa', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comunidad`
--
ALTER TABLE `comunidad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `demandante`
--
ALTER TABLE `demandante`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_7nq4petqp3avonw5tbkksvu8k` (`demandante`),
  ADD KEY `FK_42ohxb8fi9fjwg8tnkcrn3vqj` (`puestotrabajo`);

--
-- Indices de la tabla `formacion`
--
ALTER TABLE `formacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_rkylqh23adq320bwbrgtff9mm` (`demandante`),
  ADD KEY `FK_ndiocatjic5pyl35nn47vgwo4` (`titulacion`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_ospcbcdkox1m92d6acftub7bu` (`demandante`),
  ADD KEY `FK_jtwnnskbxax0f2q8butty5yj` (`oferta`);

--
-- Indices de la tabla `localizacion`
--
ALTER TABLE `localizacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_c8cbn7tlfrg2f3xuboqel0a5d` (`empresa`);

--
-- Indices de la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_5m6k3hjnv4ytgy9agn0rwopnw` (`localizacion`),
  ADD KEY `FK_iwf909xrcgegjf7enp67bwpr2` (`puestotrabajo`);

--
-- Indices de la tabla `puesto_trabajo`
--
ALTER TABLE `puesto_trabajo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_dt5v72yda88vyrddgkk9623pj` (`demandante`);

--
-- Indices de la tabla `titulaciones`
--
ALTER TABLE `titulaciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_99hidia254wtyqu5tq97k3ehy` (`oferta`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_r43af9ap4edm43mmtq01oddj6` (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comunidad`
--
ALTER TABLE `comunidad`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `demandante`
--
ALTER TABLE `demandante`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `formacion`
--
ALTER TABLE `formacion`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `localizacion`
--
ALTER TABLE `localizacion`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `oferta`
--
ALTER TABLE `oferta`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `puesto_trabajo`
--
ALTER TABLE `puesto_trabajo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `titulaciones`
--
ALTER TABLE `titulaciones`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  ADD CONSTRAINT `FK_42ohxb8fi9fjwg8tnkcrn3vqj` FOREIGN KEY (`puestotrabajo`) REFERENCES `puesto_trabajo` (`id`),
  ADD CONSTRAINT `FK_7nq4petqp3avonw5tbkksvu8k` FOREIGN KEY (`demandante`) REFERENCES `users` (`id`);

--
-- Filtros para la tabla `formacion`
--
ALTER TABLE `formacion`
  ADD CONSTRAINT `FK_ndiocatjic5pyl35nn47vgwo4` FOREIGN KEY (`titulacion`) REFERENCES `titulaciones` (`id`),
  ADD CONSTRAINT `FK_rkylqh23adq320bwbrgtff9mm` FOREIGN KEY (`demandante`) REFERENCES `users` (`id`);

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `FK_jtwnnskbxax0f2q8butty5yj` FOREIGN KEY (`oferta`) REFERENCES `oferta` (`id`),
  ADD CONSTRAINT `FK_ospcbcdkox1m92d6acftub7bu` FOREIGN KEY (`demandante`) REFERENCES `users` (`id`);

--
-- Filtros para la tabla `localizacion`
--
ALTER TABLE `localizacion`
  ADD CONSTRAINT `FK_c8cbn7tlfrg2f3xuboqel0a5d` FOREIGN KEY (`empresa`) REFERENCES `users` (`id`);

--
-- Filtros para la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD CONSTRAINT `FK_5m6k3hjnv4ytgy9agn0rwopnw` FOREIGN KEY (`localizacion`) REFERENCES `localizacion` (`id`),
  ADD CONSTRAINT `FK_iwf909xrcgegjf7enp67bwpr2` FOREIGN KEY (`puestotrabajo`) REFERENCES `puesto_trabajo` (`id`);

--
-- Filtros para la tabla `puesto_trabajo`
--
ALTER TABLE `puesto_trabajo`
  ADD CONSTRAINT `FK_dt5v72yda88vyrddgkk9623pj` FOREIGN KEY (`demandante`) REFERENCES `users` (`id`);

--
-- Filtros para la tabla `titulaciones`
--
ALTER TABLE `titulaciones`
  ADD CONSTRAINT `FK_99hidia254wtyqu5tq97k3ehy` FOREIGN KEY (`oferta`) REFERENCES `oferta` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
