package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RESUME_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.ResumeAction;

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
