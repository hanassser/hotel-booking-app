package com.hang.hotelbooking.repository;

import com.hang.hotelbooking.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
