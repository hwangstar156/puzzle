ALTER TABLE `users`
    ADD COLUMN `email` varchar(255) NOT NULL AFTER `username`;