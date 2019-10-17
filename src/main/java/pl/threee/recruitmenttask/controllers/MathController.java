package pl.threee.recruitmenttask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.threee.recruitmenttask.dto.MathResultDto;
import pl.threee.recruitmenttask.services.MathService;

@RestController
@RequestMapping("/math")
public class MathController {
    private static final String ADD_PATH = "/add";
    private static final String DIVIDE_PATH = "/div";
    private static final String VAL1_PARAM = "val1";
    private static final String VAL2_PARAM = "val2";

    private MathService mathService;

    @Autowired
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @PostMapping(value = ADD_PATH + "/{" + VAL1_PARAM + "}/{" + VAL2_PARAM + "}", produces = MediaType.APPLICATION_JSON_VALUE)
    public MathResultDto add(@PathVariable(VAL1_PARAM) double val1, @PathVariable(VAL2_PARAM) double val2) {
        double result = mathService.add(val1, val2);
        return new MathResultDto(result);
    }

    @GetMapping(value = DIVIDE_PATH + "/{" + VAL1_PARAM + "}/{" + VAL2_PARAM + "}", produces = MediaType.APPLICATION_JSON_VALUE)
    public MathResultDto divide(@PathVariable(VAL1_PARAM) double val1, @PathVariable(VAL2_PARAM) double val2) {
        double result = mathService.divide(val1, val2);
        return new MathResultDto(result);
    }
}
