package service;

import model.dto.CandidateDto;
import model.entity.Candidate;

public interface CandidateService {

    Candidate save(Candidate candidate);

}
