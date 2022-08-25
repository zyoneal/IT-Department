package controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Constants;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(Constants.API_ENDPOINT + "/candidates")
public class CandidateController {



}
