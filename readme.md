#### Springboot+Exposed(ORM)
#### 测试表sql
        /*
        Navicat Premium Data Transfer
        
        Source Server         : localhost
        Source Server Type    : MySQL
        Source Server Version : 80100
        Source Host           : 127.0.0.1:10001
        Source Schema         : test
        
        Target Server Type    : MySQL
        Target Server Version : 80100
        File Encoding         : 65001
        
        Date: 20/09/2023 14:36:25
        */
        
        SET NAMES utf8mb4;
        SET FOREIGN_KEY_CHECKS = 0;
        
        -- ----------------------------
        -- Table structure for users
        -- ----------------------------
        DROP TABLE IF EXISTS `users`;
        CREATE TABLE `users`  (
        `id` int unsigned NOT NULL,
        `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
        PRIMARY KEY (`id`) USING BTREE
        ) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;
        
        SET FOREIGN_KEY_CHECKS = 1;