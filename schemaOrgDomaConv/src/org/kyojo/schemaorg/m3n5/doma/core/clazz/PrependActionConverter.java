package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PREPEND_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.PrependAction;

@ExternalDomain
public class PrependActionConverter implements DomainConverter<PrependAction, String> {

	@Override
	public String fromDomainToValue(PrependAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrependAction fromValueToDomain(String value) {
		return new PREPEND_ACTION(value);
	}

}
