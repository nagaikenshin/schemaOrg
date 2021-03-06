package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ASSESS_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.AssessAction;

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
