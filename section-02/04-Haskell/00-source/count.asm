count:
(__TEXT,__text) section
_iterate:
0000000100003ee0	pushq	%rbp
0000000100003ee1	movq	%rsp, %rbp
0000000100003ee4	movq	%rdi, -0x8(%rbp)
0000000100003ee8	movl	$0x0, -0xc(%rbp)
0000000100003eef	cmpl	$0x3e8, -0xc(%rbp)              ## imm = 0x3E8
0000000100003ef6	jge	0x100003f19
0000000100003efc	movl	0x40fe(%rip), %eax
0000000100003f02	addl	$0x1, %eax
0000000100003f05	movl	%eax, 0x40f5(%rip)
0000000100003f0b	movl	-0xc(%rbp), %eax
0000000100003f0e	addl	$0x1, %eax
0000000100003f11	movl	%eax, -0xc(%rbp)
0000000100003f14	jmp	0x100003eef
0000000100003f19	xorl	%eax, %eax
0000000100003f1b	popq	%rbp
0000000100003f1c	retq
0000000100003f1d	nopl	(%rax)
_main:
0000000100003f20	pushq	%rbp
0000000100003f21	movq	%rsp, %rbp
0000000100003f24	subq	$0x10, %rsp
0000000100003f28	leaq	-0x8(%rbp), %rdi
0000000100003f2c	xorl	%eax, %eax
0000000100003f2e	movl	%eax, %ecx
0000000100003f30	leaq	-0x57(%rip), %rdx
0000000100003f37	movq	%rcx, %rsi
0000000100003f3a	callq	0x100003f92
0000000100003f3f	leaq	-0x10(%rbp), %rdi
0000000100003f43	xorl	%eax, %eax
0000000100003f45	movl	%eax, %ecx
0000000100003f47	leaq	-0x6e(%rip), %rdx
0000000100003f4e	movq	%rcx, %rsi
0000000100003f51	callq	0x100003f92
0000000100003f56	movq	-0x8(%rbp), %rdi
0000000100003f5a	xorl	%eax, %eax
0000000100003f5c	movl	%eax, %esi
0000000100003f5e	callq	0x100003f98
0000000100003f63	movq	-0x10(%rbp), %rdi
0000000100003f67	xorl	%eax, %eax
0000000100003f69	movl	%eax, %esi
0000000100003f6b	callq	0x100003f98
0000000100003f70	movl	0x408a(%rip), %esi
0000000100003f76	leaq	0x21(%rip), %rdi
0000000100003f7d	movb	$0x0, %al
0000000100003f7f	callq	0x100003f8c
0000000100003f84	xorl	%eax, %eax
0000000100003f86	addq	$0x10, %rsp
0000000100003f8a	popq	%rbp
0000000100003f8b	retq
