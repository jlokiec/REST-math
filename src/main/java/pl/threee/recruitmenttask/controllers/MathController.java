package pl.threee.recruitmenttask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.threee.recruitmenttask.dto.MathResultDto;
import pl.threee.recruitmenttask.services.MathService;

@RestController
@RequestMapping("/math")
public class MathController {
    private static final String ADD_PATH = "/add";
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
}
