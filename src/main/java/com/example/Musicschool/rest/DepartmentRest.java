package com.example.Musicschool.rest;

import com.example.Musicschool.dto.DepartmentDto;
import com.example.Musicschool.dto.ResponseDto;
import com.example.Musicschool.projection.DepartmentProjection;
import com.example.Musicschool.service.DepartmentService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public record DepartmentRest(DepartmentService service) {
    @PostMapping
    public ResponseDto<DepartmentDto> post(@Valid @RequestBody DepartmentDto dto){
        return service.post(dto);
    }
    @PatchMapping
    public ResponseDto<DepartmentDto> patch(@Valid @RequestBody DepartmentDto dto){
        return service.patch(dto);
    }
    @GetMapping("/getAllDepartmentDirection")
    public ResponseDto<List<DepartmentProjection>> getAllDepartment(){
        return service.getAllDepartment();
    }
    @GetMapping("/getAllDirectionByDepartment")
    public ResponseDto<List<DepartmentProjection>> getAllDirectionDepartment(@Param("id") Long id){
        return service.getAllDirection(id);
    }
    @GetMapping("/getAll")
    public ResponseDto<List<DepartmentDto>> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public ResponseDto<DepartmentDto> delete(@NotNull @PathVariable Long id){
        return service.delete(id);
    }
}
