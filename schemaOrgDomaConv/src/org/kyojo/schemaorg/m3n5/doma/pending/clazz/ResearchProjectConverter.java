package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.RESEARCH_PROJECT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ResearchProject;

@ExternalDomain
public class ResearchProjectConverter implements DomainConverter<ResearchProject, String> {

	@Override
	public String fromDomainToValue(ResearchProject domain) {
		return domain.getNativeValue();
	}

	@Override
	public ResearchProject fromValueToDomain(String value) {
		return new RESEARCH_PROJECT(value);
	}

}
