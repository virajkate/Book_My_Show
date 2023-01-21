package com.example.Book_My_Show_Backend.Repository;

import com.example.Book_My_Show_Backend.Models.ShowSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository  extends JpaRepository<ShowSeatEntity,Integer> {
}
