package com.example.Musicschool.rest;

import com.example.Musicschool.dto.ResponseDto;
import com.example.Musicschool.dto.SchoolDto;
import com.example.Musicschool.dto.StatisticDto;
import com.example.Musicschool.service.StatisticService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/statistic")
public record StatisticRest(StatisticService service) {
    @PostMapping
    public ResponseDto<StatisticDto> post(@Valid @RequestBody StatisticDto dto){
        return service.post(dto);
    }
    @PatchMapping
    public ResponseDto<StatisticDto> patch(@Valid @RequestBody StatisticDto dto){
        return service.patch(dto);
    }
    @GetMapping
    public ResponseDto<List<StatisticDto>> get(){
        return service.get();
    }
    @DeleteMapping("/{id}")
    public ResponseDto<StatisticDto> delete(@NotNull @PathVariable Long id){
        return service.delete(id);
    }
}
