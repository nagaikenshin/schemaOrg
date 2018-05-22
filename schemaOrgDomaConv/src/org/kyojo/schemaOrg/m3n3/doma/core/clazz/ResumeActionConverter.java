package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESUME_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ResumeAction;

@ExternalDomain
public class ResumeActionConverter implements DomainConverter<ResumeAction, String> {

	@Override
	public String fromDomainToValue(ResumeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ResumeAction fromValueToDomain(String value) {
		return new RESUME_ACTION(value);
	}

}
