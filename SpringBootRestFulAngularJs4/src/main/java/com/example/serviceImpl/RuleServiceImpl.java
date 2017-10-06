package com.example.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.RuleDao;
import com.example.entity.Rule;
import com.example.service.RuleService;
/**
 * @author Ittipol
 *
 */
@Service
public class RuleServiceImpl implements RuleService {
	
	@Autowired
	private RuleDao ruleDao;
	@Override
	@Transactional
	public void save(Rule rule) {
		ruleDao.save(rule);
	}

	@Override
	@Transactional
	public void delete(int ruleId) {
		ruleDao.delete(ruleId);		
	}

	@Override
	public List<Rule> findAll() {
		return ruleDao.findAll();
	}
}
