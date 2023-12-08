package com.example.Musicschool.rest;

import com.example.Musicschool.dto.AcceptanceDto;
import com.example.Musicschool.dto.ResponseDto;
import com.example.Musicschool.service.AcceptanceService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acceptance")
public record AcceptanceRest(AcceptanceService service) {
    @PostMapping
    public ResponseDto<AcceptanceDto> post(@Valid @RequestBody AcceptanceDto dto){
        return service.post(dto);
    }
    @PatchMapping
    public ResponseDto<AcceptanceDto> patch(@Valid @RequestBody AcceptanceDto dto){
        return service.patch(dto);
    }
    @GetMapping
    public ResponseDto<List<AcceptanceDto>> get(){
        return service.get();
    }
    @DeleteMapping("/{id}")
    public ResponseDto<AcceptanceDto> delete(@NotNull @PathVariable Long id){
        return service.delete(id);
    }
}
