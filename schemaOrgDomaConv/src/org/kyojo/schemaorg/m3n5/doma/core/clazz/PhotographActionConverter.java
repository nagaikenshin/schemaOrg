package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PHOTOGRAPH_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.PhotographAction;

@ExternalDomain
public class PhotographActionConverter implements DomainConverter<PhotographAction, String> {

	@Override
	public String fromDomainToValue(PhotographAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public PhotographAction fromValueToDomain(String value) {
		return new PHOTOGRAPH_ACTION(value);
	}

}