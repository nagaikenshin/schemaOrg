package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.X_PATH_TYPE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.XPathType;

@ExternalDomain
public class XPathTypeConverter implements DomainConverter<XPathType, String> {

	@Override
	public String fromDomainToValue(XPathType domain) {
		return domain.getNativeValue();
	}

	@Override
	public XPathType fromValueToDomain(String value) {
		return new X_PATH_TYPE(value);
	}

}
