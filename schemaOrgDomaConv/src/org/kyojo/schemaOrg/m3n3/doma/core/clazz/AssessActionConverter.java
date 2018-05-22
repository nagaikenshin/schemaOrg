package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ASSESS_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AssessAction;

@ExternalDomain
public class AssessActionConverter implements DomainConverter<AssessAction, String> {

	@Override
	public String fromDomainToValue(AssessAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AssessAction fromValueToDomain(String value) {
		return new ASSESS_ACTION(value);
	}

}
