package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ACTION_ACCESS_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ActionAccessSpecification;

@ExternalDomain
public class ActionAccessSpecificationConverter implements DomainConverter<ActionAccessSpecification, String> {

	@Override
	public String fromDomainToValue(ActionAccessSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActionAccessSpecification fromValueToDomain(String value) {
		return new ACTION_ACCESS_SPECIFICATION(value);
	}

}
