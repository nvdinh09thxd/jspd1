-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 19, 2020 lúc 06:02 PM
-- Phiên bản máy phục vụ: 10.1.32-MariaDB
-- Phiên bản PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `myfriends`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `friends`
--

CREATE TABLE `friends` (
  `fid` int(11) NOT NULL,
  `fname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `preview_text` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `date_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fl_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `friends`
--

INSERT INTO `friends` (`fid`, `fname`, `preview_text`, `date_create`, `fl_id`) VALUES
(1, 'Nguyễn Văn Tèo', 'Bạn thân vẫn chia sẻ, trò chuyện trước', '2020-06-18 12:10:29', 1),
(2, 'Trần Thị Diệu Thảo', 'Tôi với thằng bạn thân vẫn hay trò chuyện, chia sẻ', '2020-06-18 12:12:50', 1),
(3, 'Trần Việt Anh', 'Tôi với thằng bạn thân vẫn hay chia sẻ và trò chuyện với nhau trước', '2020-06-18 12:13:44', 2),
(4, 'Nguyễn Xuân Thành', 'Chúng tôi là bạn từ thuở đi học mẫu giáo', '2020-06-18 12:14:28', 4),
(5, 'Trần Thị Mỹ Hạ', 'Trước những tin vịt đã truyền qua lớp khác', '2020-06-18 12:15:23', 3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `friend_list`
--

CREATE TABLE `friend_list` (
  `fl_id` int(11) NOT NULL,
  `flname` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `friend_list`
--

INSERT INTO `friend_list` (`fl_id`, `flname`) VALUES
(1, 'Bạn quen thời phổ thông'),
(2, 'Bạn quen thời đại học'),
(3, 'Bạn tâm giao'),
(4, 'Bạn chí cốt');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `friends`
--
ALTER TABLE `friends`
  ADD PRIMARY KEY (`fid`),
  ADD KEY `fl_id` (`fl_id`);

--
-- Chỉ mục cho bảng `friend_list`
--
ALTER TABLE `friend_list`
  ADD PRIMARY KEY (`fl_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `friends`
--
ALTER TABLE `friends`
  MODIFY `fid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `friend_list`
--
ALTER TABLE `friend_list`
  MODIFY `fl_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `friends`
--
ALTER TABLE `friends`
  ADD CONSTRAINT `friends_ibfk_1` FOREIGN KEY (`fl_id`) REFERENCES `friend_list` (`fl_id`),
  ADD CONSTRAINT `friends_ibfk_2` FOREIGN KEY (`fl_id`) REFERENCES `friend_list` (`fl_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
