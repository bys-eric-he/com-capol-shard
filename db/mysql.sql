CREATE DATABASE `db_capol_shard` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


CREATE TABLE `tb_log_id_0` (
  `id` bigint NOT NULL,
  `comment` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '记录内容',
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `tb_log_id_1` (
  `id` bigint NOT NULL,
  `comment` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '记录内容',
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


CREATE TABLE `tb_log_date_202212` (
  `id` bigint NOT NULL,
  `comment` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '记录内容',
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `tb_log_date_202211` (
  `id` bigint NOT NULL,
  `comment` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '记录内容',
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
